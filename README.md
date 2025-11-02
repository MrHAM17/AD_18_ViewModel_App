## AD_18_ViewModel_App

### 📱 Short Description

A simple counter application demonstrating the use of the **ViewModel** component to manage and **persist UI data** across configuration changes (like screen rotation).

---

### 🧩 Concepts Covered

* **ViewModel** (class responsible for preparing and managing data for an Activity/Fragment)
* **Data Persistence** (ViewModel survives configuration changes)
* **ViewModel Provider** (tool for initializing/retrieving ViewModel instances)
* Separation of Concerns (data logic separated from UI components)

---

### 🎯 Learning / Discovery Points

* Understanding that UI variables (like a counter) are lost during **screen rotation** (configuration change).
* Adding the required **ViewModel dependency** to the `build.gradle` file.
* Initializing the ViewModel instance using `ViewModelProvider.get()` to ensure it is correctly **scoped to the Activity lifecycle**.
* Moving mutable UI state data (the counter variable) into the ViewModel class.

---

### ⚙️ App Features / Usage

* Displays a simple counter value.
* Button increases the counter.
* The counter state is preserved when the device screen is rotated.

---

### 📝 Note

This is the foundational project for understanding how to use the **ViewModel** to prevent data loss and enhance application reliability.

---
