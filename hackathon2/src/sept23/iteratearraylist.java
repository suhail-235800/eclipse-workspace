package sept23;

import java.util.ArrayList;
import java.util.List;

public class iteratearraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Blue");
        list_Strings.add("Green");
        list_Strings.add("White");
        list_Strings.add("Black");
        for (String element : list_Strings) {
          System.out.println(element);
        }
		
	}

}
