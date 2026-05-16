<div align="center">

# 💪 AI-Powered Fitness Platform

### Smart Fitness & Wellness Management System

A full-stack AI-powered fitness platform that helps users manage workouts, track health progress, and receive personalized fitness recommendations. Built with Spring Boot microservices architecture, secure authentication, event-driven communication, and a modern React frontend.

<br/>

![Java](https://img.shields.io/badge/Java-17-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)
![Spring Boot](https://img.shields.io/badge/Spring_Boot-3.x-6DB33F?style=for-the-badge&logo=springboot&logoColor=white)
![React](https://img.shields.io/badge/React-18-61DAFB?style=for-the-badge&logo=react&logoColor=black)
![Kafka](https://img.shields.io/badge/Apache_Kafka-000000?style=for-the-badge&logo=apachekafka&logoColor=white)
![MongoDB](https://img.shields.io/badge/MongoDB-47A248?style=for-the-badge&logo=mongodb&logoColor=white)
![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=for-the-badge&logo=mysql&logoColor=white)
![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)

</div>

---

## 📌 Project Overview

AI-Powered Fitness Platform is a cloud-ready microservices application designed to provide personalized fitness guidance, workout management, and health tracking. The platform integrates AI capabilities for smart recommendations, secure authentication using Keycloak, and scalable communication through Apache Kafka.

---

## ✨ Features

| Module | Description |
|---|---|
| 🔐 Authentication | Secure login/signup using Keycloak and OAuth2 |
| 👤 User Profile | Manage personal fitness details and goals |
| 🏋️ Workout Management | Track workouts, schedules, and activity |
| 🥗 Nutrition Tracking | Monitor meal plans and calorie intake |
| 🤖 AI Recommendations | Personalized fitness suggestions using Google API |
| 📩 Event Streaming | Kafka-based async communication |
| 🌐 API Gateway | Centralized routing for all services |
| 🔍 Service Discovery | Eureka Server for microservices registration |

---

## 🛠 Tech Stack

### Backend
- :contentReference[oaicite:0]{index=0}
- :contentReference[oaicite:1]{index=1}
- :contentReference[oaicite:2]{index=2}
- OAuth2
- API Gateway
- :contentReference[oaicite:3]{index=3}

### Frontend
- :contentReference[oaicite:4]{index=4}

### Databases
- :contentReference[oaicite:5]{index=5}
- :contentReference[oaicite:6]{index=6}

### DevOps / Tools
- :contentReference[oaicite:7]{index=7}
- :contentReference[oaicite:8]{index=8}
- :contentReference[oaicite:9]{index=9}
- :contentReference[oaicite:10]{index=10} API Key

---

## 📦 Microservices

| Service | Port | Responsibility |
|---|---|---|
| API Gateway | 8080 | Entry point for client requests |
| Eureka Server | 8761 | Service registry |
| Auth Service | 8081 | Authentication via Keycloak |
| User Service | 8082 | User profile management |
| Workout Service | 8083 | Workout management |
| Nutrition Service | 8084 | Nutrition tracking |
| AI Service | 8085 | AI recommendations |

---

## 🚀 Getting Started

### Clone Repository

```bash
git clone https://github.com/your-username/ai-powered-fitness-platform.git
cd ai-powered-fitness-platform
```

---

### Backend Setup

```bash
mvn clean install
docker-compose up
```

---

### Frontend Setup

```bash
cd frontend
npm install
npm start
```

Frontend runs at:

```text
http://localhost:3000
```

Backend gateway:

```text
http://localhost:8080
```

---

## 🌐 API Endpoints

### Authentication

```http
POST /api/auth/login
POST /api/auth/register
```

### Workouts

```http
GET    /api/workouts
POST   /api/workouts
PUT    /api/workouts/{id}
DELETE /api/workouts/{id}
```

### Nutrition

```http
GET    /api/nutrition
POST   /api/nutrition
```

### AI Features

```http
GET /api/ai/recommendations
GET /api/ai/workout-plan
GET /api/ai/diet-plan
```

---

## 🏗 Architecture

- Microservices Architecture  
- API Gateway Pattern  
- Service Discovery with Eureka  
- Event-Driven Architecture using Kafka  
- Secure Authentication with Keycloak + OAuth2  
- Dockerized Deployment  

---

## 🔮 Future Enhancements

- AI chatbot for fitness guidance  
- Wearable device integration  
- Real-time notifications  
- Kubernetes deployment  
- CI/CD pipeline  

---

## 👨‍💻 Author

Developed by **Om Chaudhari** to demonstrate full-stack development, microservices, secure authentication, and AI integration using Java ecosystem.

---
