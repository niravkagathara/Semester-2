ublic class Dispatch{
  public static void main(String[] args){

    Book b1 = new Book(args[0]);

    int n = Integer.parseInt(args[1]);

    switch(n){
      case 1 : 
        System.out.println(b1);
        b1 = new BookPublication (args[0],args[2]);
        System.out.println(b1);
        break;

      case 2 :
        System.out.println(b1);
        b1 = new PaperPublication (args[0],args[2]);
        System.out.println(b1);
        break;
      default : 
        System.out.println(b1);
        System.out.println("TITLE DON't DEFINED");    
    }

  }
}

class Book{
  private String authorName;

  
  Book(String authorName) {
    this.authorName = authorName;
  }

  public String toString(){
    return "Author : " + authorName ; 
  }
}


class BookPublication extends Book{
  private String title;

  BookPublication(String authorName,String title){
    super(authorName);
    this.title = title;
  }

  public String toString(){
    return "TITLE : " + title ; 
  }


}

class PaperPublication extends Book{
  private String title;

  PaperPublication(String authorName,String title){
    super(authorName);
    this.title = title;
  }

  public String toString(){
    return "TITLE : " + title ; 
  }


}

