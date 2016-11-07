
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class NumberPicker {

	static enum Result {
		Win, Lose, Draw
	}

	private static LinkedList<Integer> list;
	private static int listSize, firstPlayerValue = 0, secondPlayerValue = 0;
	private static final String MY_TURN = "mine";
	private static final String OTHERS_TURN = "others";

	public static void main(String[] args) {
		List<Integer> list = getList();
		Result result = findWinner(list);
		System.out.println(result);
	}

	public static Result findWinner(List<Integer> input) {
		int firstPlayerValue = implementInt();
		if (firstPlayerValue > secondPlayerValue) {
			return Result.Win;
		} else if (firstPlayerValue < secondPlayerValue) {
			return Result.Lose;
		} else {
			return Result.Draw;
		}
	}
	
	//Started with examining a sample list of numbers
	public static List<Integer> getList() {
		list = new LinkedList<>();
		
		
		list.add(-8);
		list.add(2);
		list.add(10);
		

		return list;
	}
	
	public static boolean implementBoolean() {
		if (list.isEmpty()) {
			return true;
		}
		return false;
	}

	public static int implementInt() {
		listSize = list.size();
		int leftHead = 0, rightHead = 0;
		int pickedNo = 0;
		List<Integer> myList = new ArrayList<>();
		List<Integer> othersList = new ArrayList<>();
		String turn = MY_TURN;

		if (listSize == 1) {
			return list.get(0);
		} else {
			while (!implementBoolean()) {
				listSize = list.size();
				leftHead = list.get(0);
				rightHead = list.get(listSize - 1);

				if (leftHead >= rightHead) {
					pickedNo = leftHead;
					list.removeFirst();
				} else {
					pickedNo = rightHead;
					list.removeLast();
				}

				if (turn.equals(MY_TURN)) {
					myList.add(pickedNo);
					turn = OTHERS_TURN;
				} else if (turn.equals(OTHERS_TURN)) {
					othersList.add(pickedNo);
					turn = MY_TURN;
				}
			}
		}

		for (Integer element : myList) {
			firstPlayerValue += element;
		}
		
		for (Integer element : othersList) {
			secondPlayerValue += element;
		}
		
		return firstPlayerValue;
	}
}
