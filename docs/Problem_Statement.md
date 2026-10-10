# Problem Statement

## 1. Title
Public Infrastructure Issue Reporting and Management System

## 2. Domain
CivicTech / Public Infrastructure Management

## 3. Who is the user?
Citizen  
Staff  
Administrator

## 4. What problem are we solving?
Citizens often have no clear, reliable way to report potholes, broken streetlights, garbage accumulation, drainage problems, and other public infrastructure issues. Reports made through informal channels can be difficult to track, may not reach the responsible department, and provide little visibility into progress. Municipal staff also need a structured way to assign complaints, record work, and communicate status updates. This project provides one traceable platform for reporting, managing, and monitoring public infrastructure issues.

## 5. Proposed Solution
Phase 1 establishes the Spring Boot REST API, React client, environment-based configuration, and health monitoring foundation. Later phases will add JWT authentication, role-based permissions, issue reporting, department assignment, status history, attachments, notifications, feedback, dashboards, filtering, testing, deployment, and an AI recommendation enhancement.

## 6. Core Entities / Database Tables
The planned domain tables are users, departments, issue_categories, issues, issue_status_history, issue_comments, issue_attachments, feedback, and notifications. They will be introduced with their relationships in Phase 2.

## 7. User Roles & Permissions
Citizens will report and track their own issues. Staff will manage issues assigned to their department. Administrators will manage users, departments, categories, assignments, reports, and system configuration.

## 8. Success Criteria
- A citizen can submit and track an infrastructure issue.
- Staff can manage authorized departmental issues.
- Administrators can monitor system activity and statistics.
- APIs use consistent response structures and validation.
- The application can be deployed with environment-based configuration.

## 9. Out of Scope
- Direct government payment processing
- Emergency police or fire dispatch
- Automatic physical repair
- Complex GIS analytics
- Native Android or iOS applications
- Real-time IoT sensors

## 10. Chosen Track
Java — Spring Boot
