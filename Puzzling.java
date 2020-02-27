import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Arrays;
public class PuzzleJava {
    
    public int[] printarray()
    {
        int[] arr = {3,5,1,2,7,9,8,13,25,32};
        int[] arr1 = new int[10];
        int j = 0;
        for(int i = 0; i < arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		for(int i = 0; i < arr.length; i++)
		{
			if(arr[i] > 10)
			{
			   arr1[j] = arr[i];
			   j=j+1;
			}
		}
		return arr1;
    }
    public void createstring()
	{
	    ArrayList<Character> str = new ArrayList<Character>();
        str.add('a');
        str.add('b');
        str.add('c');
        str.add('d');
        str.add('e');
        str.add('f');
        str.add('g');
        str.add('h');
        str.add('i');
        str.add('j');
        str.add('k');
        str.add('l');
        str.add('m');
        str.add('n');
        str.add('o');
        str.add('p');
        str.add('q');
        str.add('r');
        str.add('s');
        str.add('t');
        str.add('u');
        str.add('v');
        str.add('w');
        str.add('x');
        str.add('y');
        str.add('z');
        
        Collections.shuffle(str);
        
	    String str1 = " ";
		for(int i = 0; i < 5; i++)
		{
			str1 = str1 + str.get(0);
		}
	}
	public void createrandomstrings()
	{
	    ArrayList<Character> str = new ArrayList<Character>();
        str.add('a');
        str.add('b');
        str.add('c');
        str.add('d');
        str.add('e');
        str.add('f');
        str.add('g');
        str.add('h');
        str.add('i');
        str.add('j');
        str.add('k');
        str.add('l');
        str.add('m');
        str.add('n');
        str.add('o');
        str.add('p');
        str.add('q');
        str.add('r');
        str.add('s');
        str.add('t');
        str.add('u');
        str.add('v');
        str.add('w');
        str.add('x');
        str.add('y');
        str.add('z');
        
        Collections.shuffle(str);
        
	    String[] str1 = {" "," "," "," "," "," "," "," "," "," "};
	    for (int j = 0; j < 10; j++)
	    {
	        for(int i = 0; i < 5; i++)
		    {
			str1[j] = str1[j] + str.get(0);
		    }
	    }
	}
    public int[] randomarray()
    {
        int[] arr = {0,0,0,0,0,0,0,0,0,0};
        Random r = new Random();
        for(int i = 0; i < arr.length; i++)
		{
		    arr[i] = r.nextInt(55) + 55;
		}
		return arr;
    }
    public int[] randomsortedarray()
    {
        int[] arr = {0,0,0,0,0,0,0,0,0,0};
        Random r = new Random();
        for(int i = 0; i < arr.length; i++)
		{
		    arr[i] = r.nextInt(55) + 55;
		}
		Arrays.sort(arr);
		return arr;
    }
    public void coll()
    {
        ArrayList<String> str = new ArrayList<String>();
        str.add("Nancy");
        str.add("Jinichi");
        str.add("Fujibayashi");
        str.add("Momochi");
        str.add("Ishikawa");
        
        Collections.shuffle(str);
        System.out.println(str); // [1, 5, 2, 4, 3]
    }
    public void alphabet()
    {
        ArrayList<Character> str = new ArrayList<Character>();
        str.add('a');
        str.add('b');
        str.add('c');
        str.add('d');
        str.add('e');
        str.add('f');
        str.add('g');
        str.add('h');
        str.add('i');
        str.add('j');
        str.add('k');
        str.add('l');
        str.add('m');
        str.add('n');
        str.add('o');
        str.add('p');
        str.add('q');
        str.add('r');
        str.add('s');
        str.add('t');
        str.add('u');
        str.add('v');
        str.add('w');
        str.add('x');
        str.add('y');
        str.add('z');
        
        Collections.shuffle(str);
        System.out.println(str.get(0)); 
        System.out.println(str.get(24)); 
    }
    
    public static void main(String[] args) {
        /*ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(4);
        numbers.add(3);
        numbers.add(2);
        numbers.add(1);
        
        Collections.shuffle(numbers);
        System.out.println(numbers); // [1, 5, 2, 4, 3]
        Collections.sort(numbers);
        System.out.println(numbers); // [1, 2, 3, 4, 5]
                
        Random r = new Random();
        System.out.println(r.nextInt()); // without bounds
        System.out.println(r.nextInt(5)); // with bounds 0 to 5*/
        PuzzleJava col = new PuzzleJava();
        int[] a = new int[10];
        a = col.printarray();
        col.coll();
        
    }
}
