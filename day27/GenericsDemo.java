package hit.day27;

public class GenericsDemo {
	public static void main(String[] args) {
		Paint paint = new RedPaint();

		 
		Powder powder = new RosePowder();
		
		GoodPaintBrush<Paint> brush = new GoodPaintBrush<>();
		
		brush.setObj(paint);
		
		Paint mypaint = brush.getObj();
		mypaint.color();
		
		GoodPaintBrush<Powder> brush2 = new GoodPaintBrush<>();
		brush2.setObj(new RosePowder());
		
		Powder myPowder = brush2.getObj();
		myPowder.doMakeup();
		
	}
}

abstract class Paint {
	public abstract void color();
}

class RedPaint extends Paint {
	@Override
	public void color() {
		System.out.println("red colour...");
		
	}
}

class BluePaint extends Paint {
	@Override
	public void color() {
		System.out.println("blur color...");
		
	}
	
}

abstract class Powder {
	public abstract void doMakeup () ;
}
class WhitePowder extends Powder {
	@Override
	public void doMakeup() {
		System.out.println("applying powder...");
		
	}
}
class RosePowder extends Powder {
	@Override
	public void doMakeup() {
		System.out.println("rose powder applied...");
		
	}
	
}
class GoodPaintBrush<T> {
	T obj;
	public void setObj(T obj) {
		this.obj = obj;
	}
	public T getObj() {
		return this.obj;
	}
}

class BadPaintBrush3 { // i have made my paint brush generic
	Object obj; // by declaring a object reference u can consume any object
	public void execute() {
		if (obj instanceof Paint) {
			Paint paint = (Paint)obj;
			paint.color();
		}
		if(obj instanceof Powder) {
			Powder makeup = (Powder)obj;
			makeup.doMakeup();
		}
	}
}

class BadPaintBrush2 { // this paint brush is specific
	Paint paint; // by declaring a specific type you can consume only an object of that type
	// coz java is a strongly typed language
	public void doPaint() {
		System.out.println(paint);
	}
}

class BadPaintBrush {
	public void doPaint (int i) {
		if(i==1) {
			RedPaint rp = new RedPaint();
			System.out.println("red paint..."+rp);
		}
		else if(i==2 ) {
			BluePaint bp =new BluePaint();
			System.out.println("blue paint..."+bp);
		}
	}
}