cat > README.md << 'EOF'
# TaskManager — Real-time Collaborative Kanban Board

A full-stack real-time task management app built with Spring Boot and WebSockets.

## Features
- JWT authentication (register/login)
- Create and manage Kanban boards
- Drag-and-drop task cards between columns
- Real-time sync across multiple users via WebSockets
- RESTful API with full CRUD

## Tech Stack
- **Backend:** Java, Spring Boot, Spring Security, Spring WebSocket
- **Database:** MySQL with Spring Data JPA
- **Auth:** JWT tokens, BCrypt password hashing
- **Real-time:** STOMP over WebSocket, SockJS
- **Frontend:** HTML, CSS, Vanilla JS, SortableJS

## Running Locally
1. Clone the repo
2. Create a MySQL database named `taskmanager`
3. Update `application.properties` with your MySQL credentials
4. Run `./mvnw spring-boot:run`
5. Open `http://localhost:8080/test.html`

## API Endpoints
| Method | Endpoint | Description |
|--------|----------|-------------|
| POST | /auth/register | Register a new user |
| POST | /auth/login | Login and get JWT token |
| GET | /boards | Get all boards |
| POST | /boards | Create a board |
| PUT | /boards/{id} | Update a board |
| DELETE | /boards/{id} | Delete a board |
| GET | /boards/{id}/tasks | Get tasks for a board |
| POST | /boards/{id}/tasks | Create a task |
| PUT | /boards/{id}/tasks/{taskId} | Update/move a task |
| DELETE | /boards/{id}/tasks/{taskId} | Delete a task |
EOF
