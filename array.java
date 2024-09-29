public class array {
    public static void main(String[] args){
        //1st method to declare and memory allocation of an array.
        // Declarion is int[]marks. And Memory allocation is new int[5].

        /*int[] marks=new int[5];
        marks[0]=56;
        marks[1]=78;
        marks[2]=57;
        marks[3]=77;
        marks[4]=48;
        System.out.println(marks[3]);*/

        //2nd method to declare, memoey allocation and initialization togther in ome line.
        //Number Array
        
        int[]marks={100,50,70,30,56};
        //float[]marks={23.89f,44.45f,55.55f,66.45f,77.05f};
        //System.out.println(marks.length);
        //System.out.println(marks[4]);

        //String Array
        String[] students={"bcwyb","efygefg","ewfygeg","effygefg","efuybveg"};
        System.out.println(students.length);
        System.out.println(students[3]);

        //Displaying the array (simple way). Tis is cointains so much lines
        /*int[]marks={100,50,70,30,56};
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);*/

        //Displaying the array using (for loop).
        //int[]marks={100,50,70,30,56};
        for(int i=0;i<5;i++){                //or you can use marks.length in i<5
            System.out.println(marks[i]);
        }

        // In Reverse Order.
        for(int i=4-1;i>=0;i--){            //or you can use marks.length-1 in i=4-1
            System.out.println(marks[i]);
        }
        
        //For-Each loop.
        for(int element:marks){
          System.out.println(element);
        }
    }
}
