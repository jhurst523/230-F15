package submission;

public class RecursiveInsertionSorter {
	public static <T> int[] sort(T unsorted2, T[] unsorted, int first, int last) {
		if (first < last)
		{
		// sort all but the last entry
		sort(unsorted2, unsorted, first, last - 1);
		// insert the last entry in sorted order
		sort(unsorted[last], unsorted, first, last - 1);
		} //// TODO implement recursive insertion sort
		return null;
	}

	public static int[] sort(int[] unsorted) {
		// TODO Auto-generated method stub
		return null;
	}

}
