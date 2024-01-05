public class Arrays {
    public static void main(String []arg){
        int []marks=new int[5];
        marks[0]=100;
        marks[1]= 50;
        System.out.println(marks[1]);

        int []mark={40,50,60,70,80};
        System.out.println(mark.length);
        for(int i=0;i<marks.length;i++){
            System.out.println(mark[i]);
        }
        
        for(int i=4;i>=0;i--){
            System.out.println(mark[i]);
        }        
        
    }
    
}
