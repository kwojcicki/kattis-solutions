import java.awt.Point;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.Stack;
import java.util.TreeSet;

public class robotprotection {

	protected static Point getLowestPoint(List<Point> points) {
		Point lowest = points.get(0);
		for(int i = 1; i < points.size(); i++) {
			Point temp = points.get(i);
			if(temp.y < lowest.y || (temp.y == lowest.y && temp.x < lowest.x)) {
				lowest = temp;
			}
		}
		return lowest;
	}

	protected static Set<Point> getSortedPointSet(List<Point> points) {
		final Point lowest = getLowestPoint(points);
		TreeSet<Point> set = new TreeSet<Point>(new Comparator<Point>() {
			@Override
			public int compare(Point a, Point b) {
				if(a == b || a.equals(b)) {
					return 0;
				}
				// use longs to guard against int-underflow
				double thetaA = Math.atan2((long)a.y - lowest.y, (long)a.x - lowest.x);
				double thetaB = Math.atan2((long)b.y - lowest.y, (long)b.x - lowest.x);

				if(thetaA < thetaB) {
					return -1;
				}
				else if(thetaA > thetaB) {
					return 1;
				}
				else {
					// collinear with the 'lowest' point, let the point closest to it come first
					// use longs to guard against int-over/underflow
					double distanceA = Math.sqrt((((long)lowest.x - a.x) * ((long)lowest.x - a.x)) +
							(((long)lowest.y - a.y) * ((long)lowest.y - a.y)));
					double distanceB = Math.sqrt((((long)lowest.x - b.x) * ((long)lowest.x - b.x)) +
							(((long)lowest.y - b.y) * ((long)lowest.y - b.y)));

					if(distanceA < distanceB) {
						return -1;
					}
					else {
						return 1;
					}
				}
			}
		});

		set.addAll(points);

		return set;
	}

	protected static Turn getTurn(Point a, Point b, Point c) {

		long crossProduct = (((long)b.x - a.x) * ((long)c.y - a.y)) -
				(((long)b.y - a.y) * ((long)c.x - a.x));

		if(crossProduct > 0) {
			return Turn.COUNTER_CLOCKWISE;
		} else if(crossProduct < 0) {
			return Turn.CLOCKWISE;
		} else {
			return Turn.COLLINEAR;
		}
	}

	protected static enum Turn { CLOCKWISE, COUNTER_CLOCKWISE, COLLINEAR }

	public static ArrayList<Point> getConvexHull(List<Point> points) {
		ArrayList<Point> sorted = null;

		sorted = new ArrayList<Point>(getSortedPointSet(points));


		Stack<Point> stack = new Stack<Point>();
		if(sorted.size() < 3){
			return sorted;
		}
		stack.push(sorted.get(0));
		stack.push(sorted.get(1));

		for (int i = 2; i < sorted.size(); i++) {
			Point head = sorted.get(i);
			Point middle = stack.pop();
			Point tail = stack.peek();

			Turn turn = getTurn(tail, middle, head);

			switch(turn) {
			case COUNTER_CLOCKWISE:
				stack.push(middle);
				stack.push(head);
				break;
			case CLOCKWISE:
				i--;
				break;
			case COLLINEAR:
				stack.push(head);
				break;
			}
		}
		// close the hull
		stack.push(sorted.get(0));

		return new ArrayList<Point>(stack);
	}

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for(String s = in.readLine(); s != null && !s.equals("0"); s = in.readLine() ){
			int n = Integer.parseInt(s);
			Point[] points = new Point[n];
			for(int i = 0; i < n; i++){
				String[] c = in.readLine().split(" ");
				int x = Integer.parseInt(c[0]);
				int y = Integer.parseInt(c[1]);
				points[i] = new Point(x,y);
			}
			ArrayList<Point> x  = null;
			x = getConvexHull(Arrays.asList(points));	
			if(x.size() < 3 ) {
				System.out.println("0.0");
				continue;
			}
			double sum = 0;
			for(int i = 0; i < x.size() - 1; i++){
				sum += (x.get(i).x * x.get(i + 1).y) - (x.get(i).y * x.get(i + 1).x);
			}
			sum /= 2;
			sum = Math.abs(sum);
			System.out.println(sum);
		}
	}
}
