-- Create Database
CREATE DATABASE enterprise_system_db;
USE enterprise_system_db;

-- Hospital Module: Patients Table
CREATE TABLE patients (
    patient_id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    age INT NOT NULL,
    medical_history TEXT,
    admission_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Banking Module: Transactions Table
CREATE TABLE transactions (
    transaction_id INT AUTO_INCREMENT PRIMARY KEY,
    account_number VARCHAR(20) NOT NULL,
    amount DECIMAL(15, 2) NOT NULL,
    transaction_type VARCHAR(10) NOT NULL, -- Deposit / Withdrawal
    timestamp TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Security: Role-Based Access Table
CREATE TABLE users (
    user_id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(50) UNIQUE NOT NULL,
    encrypted_pin VARCHAR(255) NOT NULL,
    role VARCHAR(20) NOT NULL -- Admin / Doctor / Teller
);
