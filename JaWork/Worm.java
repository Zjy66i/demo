import javafx.geometry.Point2D;

public class Worm {

	public static void main(String[] args) {
		Point2D worm1 = new Point2D(1, 1);
		Point2D worm2 = new Point2D(20, 20);
		for (int i = 100; i > 0; i--) {
			System.out.println(
					"the distance between worm1 and worm2 is " + casualMove(worm1).distance(casualMove(worm2)));
		}
	}

	private static Point2D casualMove(Point2D worm) {
		int move, moveX, moveY;
		if(worm.getX() == 1){
			if(worm.getY() == 1){
				move = (int)(Math.random() * 3) + 1;
				switch(move){
				case 0:
					worm = new Point2D(worm.getX() + 1, worm.getY());
					break;
				case 1:
					worm = new Point2D(worm.getX(), worm.getY() - 1);
					break;
				case 2:
					worm = new Point2D(worm.getX() + 1, worm.getY() - 1);
					break;
				}
			}
			else if(worm.getY() == 20){
				move = (int)(Math.random() * 3) + 1;
				switch(move){
				case 0:
					worm = new Point2D(worm.getX() + 1, worm.getY());
					break;
				case 1:
					worm = new Point2D(worm.getX(), worm.getY() + 1);
					break;
				case 2:
					worm = new Point2D(worm.getX() + 1, worm.getY() + 1);
					break;
				}
			}
			else{
				move = (int)(Math.random() * 5) + 1;
				switch (move) {
				case 0:
					worm = new Point2D(worm.getX() + 1, worm.getY());
					break;
				case 1:
					worm = new Point2D(worm.getX(), worm.getY() + 1);
					break;
				case 2:
					worm = new Point2D(worm.getX(), worm.getY() - 1);
					break;
				case 3:
					worm = new Point2D(worm.getX() + 1, worm.getY() + 1);
					break;
				case 4:
					worm = new Point2D(worm.getX() + 1, worm.getY() - 1);
					break;
				}
			}
		}

		if(worm.getX() == 20){
			if(worm.getY() == 1){
				move = (int)(Math.random() * 3) + 1;
				switch(move){
				case 0:
					worm = new Point2D(worm.getX() - 1, worm.getY());
					break;
				case 1:
					worm = new Point2D(worm.getX(), worm.getY() - 1);
					break;
				case 2:
					worm = new Point2D(worm.getX() - 1, worm.getY() - 1);
					break;
				}
			}
			else if(worm.getY() == 20){
				move = (int)(Math.random() * 3) + 1;
				switch(move){
				case 0:
					worm = new Point2D(worm.getX() - 1, worm.getY());
					break;
				case 1:
					worm = new Point2D(worm.getX(), worm.getY() + 1);
					break;
				case 2:
					worm = new Point2D(worm.getX() - 1, worm.getY() + 1);
					break;
				}
			}
			else{
				move = (int)(Math.random() * 5) + 1;
				switch (move) {
				case 0:
					worm = new Point2D(worm.getX() - 1, worm.getY());
					break;
				case 1:
					worm = new Point2D(worm.getX(), worm.getY() + 1);
					break;
				case 2:
					worm = new Point2D(worm.getX(), worm.getY() - 1);
					break;
				case 3:
					worm = new Point2D(worm.getX() - 1, worm.getY() + 1);
					break;
				case 4:
					worm = new Point2D(worm.getX() - 1, worm.getY() - 1);
					break;
				}
			}
		}
		else{
			if(worm.getY() == 1){
				move = (int)(Math.random() * 5) + 1;
				switch (move) {
				case 0:
					worm = new Point2D(worm.getX() + 1, worm.getY());
					break;
				case 1:
					worm = new Point2D(worm.getX(), worm.getY() - 1);
					break;
				case 2:
					worm = new Point2D(worm.getX() - 1, worm.getY());
					break;
				case 3:
					worm = new Point2D(worm.getX() + 1, worm.getY() - 1);
					break;
				case 4:
					worm = new Point2D(worm.getX() - 1, worm.getY() - 1);
					break;
				}
			}
			else if(worm.getY() == 20){
				move = (int)(Math.random() * 5) + 1;
				switch (move) {
				case 0:
					worm = new Point2D(worm.getX() + 1, worm.getY());
					break;
				case 1:
					worm = new Point2D(worm.getX(), worm.getY() + 1);
					break;
				case 2:
					worm = new Point2D(worm.getX() - 1, worm.getY());
					break;
				case 3:
					worm = new Point2D(worm.getX() + 1, worm.getY() + 1);
					break;
				case 4:
					worm = new Point2D(worm.getX() - 1, worm.getY() + 1);
					break;
				}
			}
			else{
				move = (int)(Math.random() * 8) + 1;
				switch (move) {
				case 0:
					worm = new Point2D(worm.getX() + 1, worm.getY());
					break;
				case 1:
					worm = new Point2D(worm.getX() - 1, worm.getY());
					break;
				case 2:
					worm = new Point2D(worm.getX(), worm.getY() + 1);
					break;
				case 3:
					worm = new Point2D(worm.getX(), worm.getY() - 1);
					break;
				case 4:
					worm = new Point2D(worm.getX() + 1, worm.getY() + 1);
					break;
				case 5:
					worm = new Point2D(worm.getX() + 1, worm.getY() - 1);
					break;
				case 6:
					worm = new Point2D(worm.getX() - 1, worm.getY() + 1);
					break;
				case 7:
					worm = new Point2D(worm.getX() - 1, worm.getY() - 1);
					break;
				}
			}
		}
		return worm;
	}

}
