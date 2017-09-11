
public class BookDiskription {
	
	String ID;
	String IDBook;
	String Diskription;
	
	
	public BookDiskription(String ID, String IDBook, String Diskription) {
        this.ID = ID;
        this.IDBook = IDBook;
        this.Diskription = Diskription;
   }

   public String getID() {
        return ID;
   }
   public void setID(String ID) {
	this.ID = ID;
   }
   public String geIDBook() {
	return IDBook;
   }
   public void setIDBook(String IDBook) {
	this.IDBook = IDBook;
   }
   public String getDiskription() {
	return Diskription;
   }
   public void setDiskription(String Diskription) {
	this.Diskription = Diskription;
   }		

}
