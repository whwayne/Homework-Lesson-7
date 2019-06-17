package Lab10_Homework.prob1;

import java.util.*;

public class GroupUtil {
    //Fix this code
	public static Group<?> copy(Group<?> group) {
	//	List<?> elements = group.getElements();
	//	Group<?> grp = new Group<?>(group.getSpecialElement(), elements);
        return newGroupItem(group);

	}

	public  static <T> Group<T> newGroupItem(Group<T> group) {
	    T t = group.getSpecialElement();
	    List<T> elements = group.getElements();
	    return new Group<T>(t, elements) ;
    }

    //Test using this main method
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(0,1,2,3,4);
        Group<Integer> group = new Group<>(0, list);
        System.out.println(group);
        System.out.println(GroupUtil.copy(group));
    }
}
