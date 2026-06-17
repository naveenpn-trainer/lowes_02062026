# Lambda Functions and Functional Interfaces

> Lambda Functions was introduced in Java 8 to write concise code.

```java
interface DocumentWriter {
    void save();
}

class PDFWriter implements DocumentWriter {

    @Override
    public void save() {
        System.out.println("Saving as PDF");
    }
}

class XMLWriter implements DocumentWriter{
    
    @Override
    public void save() {
        System.out.println("Saving as XML");
    }
    
}


// Approach 01
DocumentWriter xmlWriter = new XMLWriter();
xmlWriter.save();

// Approach 02
DocumentWriter pdfWriter = new DocumentWriter() {
    
    @OVerride
    public void save() {
        System.out.println("Saving as pdf");
    }
};
pdfWriter.save();

# Lambda Expressions
DocumentWriter jsonWriter =     () -> System.out.println("Saving as JSON")
jsonWriter.save()
```

### Hands-on

# Number Filtering Using Predicate

## Problem Statement

You are given a list of numbers.

You need to filter numbers based on different conditions such as:

- Divisible by 3 and 5
- Even numbers divisible by 5
- Numbers NOT matching a condition

Instead of writing multiple methods for each condition, use **Predicate** to make filtering reusable.

Step 1 — Create Sample Data

```
int[] numbers = {
    1, 2, 3, 4, 5,
    6, 7, 8, 9, 10,
    11, 12, 13, 14, 15,
    16, 18, 19, 20
};
```

------

### Part 1 — Without Predicate

1. Print Numbers Divisible by 3 and 5
2. Print Numbers which are not divisible by 3 and 5

---------

```
class Stock {
    String companyName;
    String sector;
    te int price;

}
```



```
Stock[] stocks = {
    new Stock("TCS", "IT", 3500),
    new Stock("Infosys", "IT", 1450),
    new Stock("HDFC Bank", "Banking", 900),
    new Stock("Tata Motors", "Automobile", 780)
};
```

1. Print Stocks from IT Sector
2. Print High Value Stocks with Price > 1000
3. Print Stocks Whose Names Start With T
4. Stocks from IT sector AND price > 1000
5. Stocks NOT from IT sector
6. Print stocks that are NOT high-value stocks.
7. Create predicate for Automobile sector.