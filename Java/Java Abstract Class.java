import java.util.*;
abstract class Book{
	String title;
	abstract void setTitle(String s);
	String getTitle(){
		return title;
	}
	
}

//Write MyBook class here
class MyBook extends Book{
    void setTitle(String s) {
        this.title = s;
    }
}

public class Main{