interface LibraryUser {
    void registerAccount();
    void requestBook();
}

class Member implements LibraryUser {
    String accountType;
    int minAge;
    String allowedBookType;
    int loanDays;
    int age;
    String bookType;

    public Member(String accountType, int minAge, String allowedBookType, int loanDays) {
        this.accountType = accountType;
        this.minAge = minAge;
        this.allowedBookType = allowedBookType;
        this.loanDays = loanDays;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBookType(String bookType) {
        this.bookType = bookType;
    }

    public void registerAccount() {
        boolean isKid = accountType.equals("Kid");
        boolean eligible = isKid ? age < minAge : age > minAge;

        if (eligible) {
            System.out.println("You have successfully registered under a " + accountType + " Account");
            return;
        }

        String comparison = isKid ? "less than" : "greater than";
        System.out.println("Sorry, Age must be " + comparison + " " + minAge + " to register as a " + accountType.toLowerCase());
    }

    public void requestBook() {
        if (!bookType.equals(allowedBookType)) {
            System.out.println("Oops, you are allowed to take only " + allowedBookType + " books");
            return;
        }
        System.out.println("Book Issued successfully, please return the book within " + loanDays + " days");
    }
}

public class LibraryInterfaceDemo {
    public static void main(String[] args) {
        Member kid1 = new Member("Kid", 12, "Kids", 10);
        kid1.setAge(10);
        kid1.setBookType("Kids");
        kid1.registerAccount();
        kid1.requestBook();

        Member kid2 = new Member("Kid", 12, "Kids", 10);
        kid2.setAge(18);
        kid2.setBookType("Fiction");
        kid2.registerAccount();
        kid2.requestBook();

        Member adult1 = new Member("Adult", 12, "Fiction", 7);
        adult1.setAge(5);
        adult1.setBookType("Kids");
        adult1.registerAccount();
        adult1.requestBook();

        Member adult2 = new Member("Adult", 12, "Fiction", 7);
        adult2.setAge(23);
        adult2.setBookType("Fiction");
        adult2.registerAccount();
        adult2.requestBook();
    }
}