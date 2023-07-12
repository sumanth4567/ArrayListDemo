import java.util.ArrayList;
import java.util.Iterator;
//java.util package contains collection frameworks
public class ArrayListDemo {
    public static void main(String args[]){
        ArrayList<Integer> x=new ArrayList<Integer>(10);
        x.add(10);//adds element in the next space in a continuous manner
        x.add(20);
        x.add(30);
        x.add(40);
        x.add(50);
        x.add(60);
        x.add(70);
        x.add(80);
        System.out.println(x);//output after this step is [10,20,30,40,50,60,70,80]
        //0 based indexes

        //we can also determine size using below function
        int r=x.size();
        System.out.println(r);//output is 8

        //to add at a particualr position we use the below
        x.add(4,45);//adds element at index 4 and moves remaining to next step
        System.out.println(x);//output is [10,20,30,40,45,50,60,70,80]

        //we also have methods to remove elements and they are two ways
        //remove(index)
        x.remove(4);
        System.out.println(x);
        //after removing the elements after that value will be moved forward leaving no gaps
        //output after this step is [10,20,30,40,50,60,70,80]

        x.remove(Integer.valueOf(80));//removes using objects rather than index values
        x.remove(Integer.valueOf(70));
        System.out.println(x);
        //output after this step is [10,20,30,40,50,60]

        //we also have iterator method to remove multiple elements at once
        Iterator<Integer> itr= x.iterator();
        while(itr.hasNext()){
            int y=itr.next();
            if(y>50){
                itr.remove();
            }
        }
        System.out.println(x);//output is[10,20,30,40,50]

        //we can also update a value using set(index,element)
        x.set(2,25);
        System.out.println(x);//output is [10,20,25,40,50]
        x.set(2,30);
        System.out.println(x);//output is [10,20,30,40,50]

        //if we want to know the index of a particular element we can use the below functions 
        //and it gives -1 if not present
        //it returns first occurence
        int u=x.indexOf(50);
        System.out.println(u);//output is 4
        int v=x.indexOf(60);
        System.out.println(v);//output is -1 because we dont have that element
        // if we want last occurence we use the function lastIndexOf()

        //to check whether an element is present or not we use the following
        boolean b=x.contains(50);
        System.out.println(b);//returns true
        boolean b1=x.contains(60);
        System.out.println(b1);//returns false

        //we can also clear all the elements from the list at a time
        x.clear();
        System.out.println(x);//output is []

        //if we want to check whether the list is empty we use following function
        boolean b2=x.isEmpty();//functon returns a boolean value
        System.out.println(b2);//output is true
    }
}
