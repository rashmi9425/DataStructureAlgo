/**
 * Created by rashverm on 9/10/2016.
 */
import java.util.*;


class Person{
    int weight;
    int strength;
    int def;

    public int getDef() {
        return def;
    }

    public void setDef() {
        def = strength-weight;
    }


    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getWeight() {
        return weight;

    }


    public void setWeight(int weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return getWeight()+" "+getStrength()+" "+getDef()+" ";
    }
}

class Mydeff implements Comparator<Person> {

    @Override
    public int compare(Person e1, Person e2) {
        if(e1.getDef() < e2.getDef()){
            return 1;
        } else {
            return -1;
        }
    }
}

public class ArrayListExample {

    public static void main(String[] args) {
        ArrayListExample main=new ArrayListExample();
int height =4;
        List <Person> ratio=new ArrayList<>();
        Person p1=new Person();
        p1.setWeight(300);
        p1.setStrength(500);
        p1.setDef();

        Person p2=new Person();
        p2.setWeight(500);
        p2.setStrength(1000);
        p2.setDef();

        Person p3=new Person();
        p3.setWeight(100);
        p3.setStrength(200);
        p3.setDef();

        ratio.add(p1);
        ratio.add(p2);
        ratio.add(p3);


        for(Person e:ratio){

            System.out.print(e+"\n");
        }

        Collections.sort(ratio,new Mydeff());

       System.out.print("After Sorting\n");

        for(Person e:ratio){

            System.out.print(e+"\n");
        }
        int k=0,max=0;
        Iterator e=ratio.iterator();
        int deff=ratio.get(k).getDef();
        max=height;
        e.next();
        k++;
        while(e.hasNext()){
           // System.out.print("Max height="+max);
           if(deff-ratio.get(k).getWeight()>0){
            //   System.out.print(deff);
               max=max+height;
               deff=deff-ratio.get(k).getWeight();
           }

             k++;
            e.next();
        }
       System.out.print("Max height="+max);


    }

}
