# Public Infrastructure Issue Reporting and Management System
A civic technology platform for reporting, tracking, and managing public infrastructure issues.

## Live Demo link + Video Demo link
- Live demo: To be added after deployment.
- Video demo: To be added.

## Overview
This project will help citizens report infrastructure problems and help municipal staff review, assign, update, resolve, and close those reports. Development follows the 13-phase capstone plan.

## Architecture Diagram
Editable source: [docs/diagrams/architecture.mmd](docs/diagrams/architecture.mmd)

## Tech Stack
- Backend: Java 17, Spring Boot 3, Maven, REST, MySQL 8
- Frontend: React, JavaScript, Vite, Axios, React Router, Bootstrap
- Quality and delivery: JUnit 5, Mockito, GitHub Actions

## Features
Phase 1 provides the project foundation and health endpoint. Authentication, issue workflows, dashboards, notifications, feedback, testing, deployment, and AI analysis are planned for later phases.

## Screenshots
Screenshots will be added with the completed user workflows.

## Getting Started
See the Phase 1 commands below. Install Java 17 and MySQL 8 before running the backend.

### Backend
```powershell
$env:JAVA_HOME = 'C:\\Program Files\\Java\\jdk-17'
cd backend
mvn spring-boot:run
```

### Frontend
```powershell
cd frontend
npm install
npm run dev
```

## Environment Variables
Copy `.env.example` to `.env` and provide local values. Do not commit `.env`.

## API Documentation
Swagger will be added in Phase 10. Phase 1 health endpoint: `GET http://localhost:8080/api/v1/health`.

## Running Tests
```powershell
cd backend
mvn test
```

## Deployment
Cloud deployment is deferred until Phase 12. The planned hosting is Vercel or Netlify for the frontend, Render or Railway for the backend, and a managed MySQL provider.

## Folder Structure
```text
backend/    Spring Boot API
frontend/   React client
docs/       Project documents and editable diagrams
```

## Future Enhancements
JWT authentication, role-based access, issue workflow, notifications, feedback, dashboards, cloud deployment, and AI-powered issue classification.

## License
MIT. See [LICENSE](LICENSE).

## Author / Contact
Student capstone project. Add author and contact details before publication.
