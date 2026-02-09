# Department-Store-Billing-Management-System-

🔹 Project Overview (Say This in Interview)

A Core Java console-based billing software for a department store where an admin manages products and generates customer bills using collections, file handling, and exception handling.

🔹 Tech Stack

Core Java

Collections (HashMap, ArrayList)

File Handling

Exception Handling

🚫 No frameworks
🚫 No database (acceptable for Zoho)

🔹 Roles
👤 Admin

Add products

Update product price/quantity

Remove products

View product list

🧾 Billing System

Generate customer bill

Calculate total amount

Apply tax (optional)

Store bill in file

🔹 Features

Product management

Cart-based billing

Stock update after billing

File-based bill storage

Input validation

🧱 Project Structure (IMPORTANT)
department-store-billing/
│
├── Product.java
├── ProductService.java
├── BillingService.java
├── StoreException.java
└── Main.java

🧠 Class Responsibilities (Explain This)
Product.java

Product ID

Name

Price

Quantity

Encapsulation applied

ProductService.java

HashMap<Integer, Product> for fast lookup

Admin operations

Stock validation

BillingService.java

Creates cart

Calculates bill

Writes bill to file

StoreException.java

Custom exception for invalid inputs

Main.java

Menu-driven admin interface

🧾 Sample Billing Flow
Enter Product ID: 101
Enter Quantity: 2
Added to cart
Total Amount: ₹1200
Bill generated successfully
