# 📱 Clean Architecture Mobile App

**Clean Architecture** is an enterprise resource for how base structure for clean architecture mobile application developed using **Flutter** for **Android** and **iOS**, designed for internal operations in **Saudi Arabia**.

---

## 🚀 Features

- ✅ **Clean Architecture** (Core / Features / DI)
- 🔒 **Security Checks** (Root, VPN, Emulator, etc.)
- 🌐 **Robust Networking Layer** with Dio + Interceptors
- 🌍 **Multilingual Support** (Easy Localization)
- 🔁 **Automatic Token Refreshing**
- 📶 **Offline Handling** (Connectivity/Cache)
- 💉 **Dependency Injection** using `get_it`
- ⚠️ **Centralized Error Handling**
- 🧱 **State Management** using Bloc + Cubit
- 🔔 **Local & Push Notifications**
- 📅 **Calendar, Complaints, Maintenance Modules**
- 🔐 **Biometric Login (Fingerprint / Face ID)**

---

## 📁 Project Structure (`lib/`)

```
lib/
├── core/
│   ├── components/       # Shared reusable widgets
│   ├── data/             # Constants 
│   ├── global/           # Navigator key, .
│   ├── services/         # Theme, network, log.
│
├── features/
│   ├── dashboard/
│   │   ├── presentation/ # Views, viewmodels, widgets
│   │   ├── data/         # Model, repository impl
│   │   └── domain/       # Usecases, repo interface
│   │
│   ├── tasks/
│   │   ├── presentation/
│   │   ├── data/
│   │   └── domain/
│   │
│   └── profile/
│       ├── presentation/
│       ├── data/
│       └── domain/
│
└── main.dart
```

---

## 🧠 State Management

All business and UI logic is managed using **Bloc || Cubit**

---

## 📦 Main Dependencies

> ✅ Grouped by use-case and importance.

### 🧠 Core Logic & Architecture
- `flutter_bloc`, `equatable`, `get_it`, `dartz`

### 🌐 Network & Logging
- `dio`, `http`, `pretty_dio_logger`, `http_parser`

### 🧭 Routing
- `go_router`

### 📡 Connectivity
- `connectivity_plus`, `internet_connection_checker`

### 🌍 Localization
- `easy_localization`

### 🔐 Security & Permissions
- `flutter_security_checker`, `permission_handler`, `screen_protector`, `local_auth`, `flutter_secure_storage`

### 🗂️ State Persistence
- `shared_preferences`, `flutter_dotenv`

### 📸 Media Handling
- `image_picker`, `file_picker`, `open_filex`, `path`, `cached_network_image`

### 🗓️ UI Widgets & Animation
- `sizer`, `flash`, `flutter_spinkit`, `skeletonizer`, `animations`, `flutter_slidable`, `table_calendar`, `flutter_staggered_animations`, `flutter_widget_from_html`, `flutter_svg`, `badges`, `liquid_pull_to_refresh`

### 🔔 Notifications
- `flutter_local_notifications`, `firebase_messaging`

### 📦 Firebase
- `firebase_core`, `firebase_crashlytics`, `firebase_analytics`, `firebase_messaging`

### ⚙️ Utilities
- `package_info_plus`, `url_launcher`, `characters`, `encrypt`, `hijri`, `in_app_update`, `in_app_review`, `upgrader`, `share_plus`, `device_info_plus`, `location`, `flutter_map`

---

## 🛠️ Getting Started

### 🧾 Prerequisites

- **Flutter SDK ≥ 3.5.2**
- **Dart SDK ≥ 3.5.2**
- Emulator or physical device

### ⚙️ Setup & Run

```bash
flutter clean
flutter pub get
flutter run --flavor dev
# or
flutter run --flavor prod
```

---

## 📦 Building APK / AppBundle / iOS

```bash
flutter clean
flutter pub get

# Android APK
flutter build apk --release --flavor prod

# Android App Bundle
flutter build appbundle --flavor prod

# iOS Release
flutter build ios --release --flavor prod
```

---

## 🧪 Testing

> You can add tests under each `features/xyz/test` or `core/test` directory.

- Run all tests:
```bash
flutter test
```

---

## ✍️ Author

**Mohamed Adawy**

---


