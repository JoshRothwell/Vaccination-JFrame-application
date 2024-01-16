# Vaccination-JFrame-application

## Overview
This Java application was originally designed to simulate a Covid-19 vaccination programme. It manages a queue of recipients and assigns vaccination priorities based on age and medical conditions.

## Features
- **Add Recipient to Queue:** Enter recipient details, including name, age, and medical condition, and add them to the vaccination queue.
- **Display Queue:** View the list of recipients in the vaccination queue along with their details and priorities.
- **Approve Vaccination Schedule:** Approve the next schedule of vaccinations, removing recipients from the front of the queue.

## Usage
1. Launch the application using the `VaccineGUI` class.
2. Enter recipient details, including name, age, and medical condition.
3. Click "Add to Vaccination List" to add the recipient to the queue.
4. View the vaccination queue using "Display Vaccination List."
5. Approve the next vaccination schedule with the "Approve Vaccination Schedule" button.

## Priority Assignment
- Age Groups:
  - 0-17: Priority 1
  - 18-29: Priority 2
  - 30-44: Priority 3
  - 45-54: Priority 4
  - 55-64: Priority 5
  - 65-69: Priority 7
  - 70-79: Priority 8
  - 80-89: Priority 9
  - 90-100: Priority 10
- Medical Condition: Priority 6 regardlss of age. (This was per the original assessment requirements, this may be changed in the future.)

## Requirements
- Java Development Kit (JDK)
- Swing library for GUI

## Contributing
Feel free to contribute to the development of this project. Fork the repository, make your changes, and submit a pull request.
