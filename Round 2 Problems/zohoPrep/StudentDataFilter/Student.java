package StudentDataFilter;


public class Student {
    int rollNo;
    int markA;
    int markB;
    int markC;

    public Student(int rollNo,int markA,int markB,int markC){
        this.rollNo=rollNo;
        this.markA=markA;
        this.markB=markB;
        this.markC=markC;
    }
    public  boolean evaluateCondition(int fieldValue,int operator,int value){

                switch (operator) {
                    case '>':
                        return  fieldValue > value;
                    case '<':
                        return  fieldValue < value;
                       
                    case '=':
                        return  fieldValue == value;
                      
                    default:
                        return false;
                }
            }

}
