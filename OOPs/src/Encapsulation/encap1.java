package Encapsulation;
class Books
{
    //int pageNum;
    private int pageNum;//using private access modifier to use this instance variable in the class only.
    //Modulerity=>Writing well optimized and moduler code. For every activity write a seperate method.
    //setter
    void setPageNum(int x)
    {
        if(x>0){
            pageNum=x;
        }
        else
        {
            System.out.println("Enter the Non Negative Number");
        }
        
    }
    //getter
    int getPageNum()
    {
        return pageNum;
    }
}
public class encap1 {
    // public static void main(String[] args) {
    // Books book=new Books();
    // book.pageNum=100;
    // System.out.println(book.pageNum); From this main method we assign any illogical data to the pageNum.
    // }
    public static void main(String[] args) {
        Books book=new Books();
        book.setPageNum(100);
        System.out.println(book.getPageNum());
        
    }
}
