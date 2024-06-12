package classes;

 class Outer {
			class Inner {
		        void display() {
		            System.out.println("Inner Class");
		        }
		    }
		}

		public class OuterCls {
		    public static void main(String[] args) {
		        Outer outerObj = new Outer();
		        Outer.Inner innerObj = outerObj.new Inner();
		        innerObj.display();
		    }
		}


