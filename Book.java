public class Book {
    private String Title;
    private String Author;
    private String Publisher;

    public Book ()
    {

    }
    public Book (String title, String author, )
    {
        this.Title = title;
        this.Author = author;

    }
    public Book (String title, String author, String publisher)
    {
        this.Title = title;
        this.Author = author;
        this.Publisher = publisher;

    }

    public String getTitle ()
    {
        return Title;
   }
   public String getAuthor ()
   {
       return Author;

   }

   public String getPublisher()
   {
       return Publisher;
   }

   public void setTitle(String title)
   {
       Title = title;
   }
    public void setAuthor(String author)
    {
        Author = author;
    }
    public void setPublisher(String publisher)
    {
        Publisher = publisher;
    }

    public boolean awesomeBook() {
        return getAuthor = "Brandon Sanderon";
    }

    public String supportLibrary() {
        return " Support your local Library and sign up for a Library Card."
    }
}

 /*2. Create a Custom Class (anything you want - car, phone, holiday, etc.).
         Requirements:
         Minimum 3 private instance variables
        An empty constructor
        A constructor that uses only 2 of your 3 variables
        A constructor that uses all 3 of your instance variables
        Get methods for all 3 of your instance variables and Set methods for all 3 of your instance variables
        A method that returns a Boolean
        A method that returns a String (For example, if I created a Santa Custom Class, my code would look something like the attached Santa.java file. */
