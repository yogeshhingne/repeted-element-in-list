package DuplicateELement;
import java.util.*;
import java.util.stream.Collectors;
public class DuplicateElementInList{
	public static<T> Set<T>
	fun(List<T> list){
		return list.stream().filter(i->Collections.frequency(list,i)>1).collect(Collectors.toSet());
	}
	public static void main(String args[]) {
		List<Integer> list=Arrays.asList(1,2,3,1,4,4,12,51,50,50,4,3,3);
		System.out.println(fun(list));
	}

}
