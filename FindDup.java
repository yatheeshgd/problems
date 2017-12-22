import java.util.ArrayList;
import java.util.List;

public class FindDup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindDup fd = new FindDup();
		int a[] = {1,3,3};
		fd.findDuplicates(a);
	}

	public void findDuplicates(int a[]) {

		//checking for corner cases
		if(a.length == 1)
			System.out.println("Array size is not sufficient to find duplicates");
			
		if(a == null)
			System.out.println("please pass a valid array");
		
		if(a.length == 0) {
			System.out.println("Pease pass a valid array");
		}
		//traverse thru the array
		int prevEle = 0;
		List<Integer> dupElements = new ArrayList<Integer>();
		//int dupElements[] = {};
		int dupCounter = 0;
		
		for(int i = 0; i< a.length; i++) {
			
			
			if(i == 0) {
				prevEle = a[i];
			}
			else {
				//check if prevEle and a[i] are same;
				if(prevEle == a[i]) {
					//keep a counter to find the duplicate elements
					dupCounter++;
				}
				//if prevEle and a[i] are not same
				else {
					
					if(dupCounter > 0)
						dupElements.add(prevEle);
						
					prevEle = a[i];
					
					//initialize counter to zero to proceed with next element
					dupCounter = 0;
				}
				
			}
			if(i == a.length-1) {
				if(dupCounter > 0)
					dupElements.add(prevEle);
			}
		}
		
		//print the duplicate array
		for(int j = 0; j <dupElements.size(); j++) {
			System.out.println(dupElements.get(j));
		}
	}
}
