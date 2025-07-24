public class Student {
    String name ;
    int rollno;
    int [] marks;
    float Avg;
    char Grade;
    public Student( String name,int rollno,int[] marks){
        this.name=name;
        this.rollno=rollno;
        this.marks=marks;
        this.Avg=calculateAvg();
        this.Grade=assignGrade();
    }
    float calculateAvg(){
        int sum=0;
        int n=marks.length;
        for(int i=0;i<n;i++){
            sum = sum + marks[i];
                }
                Avg =(float)sum/n;
                return Avg;
    }
    char assignGrade(){
        if(Avg >=90) return 'O';
        else  if(Avg >=80) return 'A';
        else   if(Avg >=70) return 'b';
        else    if(Avg >=45) return 'c';
        else   return 'F';
    }
}
