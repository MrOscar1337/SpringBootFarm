Фермерское приложение
Это приложение представляет собой прототип системы управления фермой, 
позволяющий владельцу фермы отслеживать производство и сбор различных видов продукции.

Использованные технологии:
Java 17
Spring Boot 3.2.3
Spring Security
Spring Data JPA
Hibernate
PostgreSQL
JSON

Логин и пароль для доступа:
Администратор: admin admin
Пользователь: user user

REST API Запросы и ответы
1. Список всех продуктов
Метод: GET
URL: /api/products
Ответ:
[
    {
        "id": 2,
        "name": "Яблоко гренни смитт",
        "unit": "кг"
    },
    {
        "id": 1,
        "name": "Яблоко голден",
        "unit": "кг"
    }
]

2. Список всех работников
Метод: GET
URL: /api/employees
Ответ:
[
    {
        "id": 1,
        "firstName": "Джон",
        "lastName": "Брайан",
        "email": "John@gmail.com",
        "active": true
    },
    {
        "id": 2,
        "firstName": "Уинстон",
        "lastName": "Смитт",
        "email": "smith@gmail.com",
        "active": true
    }
]

3. Добавить новый продукт
Метод: POST
URL: /api/products/add_product
Тело запроса:
{
    "name":"Яблоко голден",
    "unit":"кг"
}
Ответ:
[
    {
        "id": 1,
        "name": "Яблоко голден",
        "unit": "кг"
    }
]

4. Добавить нового работника
Метод: POST
URL: /api/employees/add_employee
Тело запроса:
{
    "firstName":"Джон",
    "lastName":"Брайан",
    "email":"John@gmail.com"
}
Ответ:
[
    {
        "id": 1,
        "firstName": "Джон",
        "lastName": "Брайан",
        "email": "John@gmail.com",
        "active": true
    }
]

5. Изменить информацию о продукте
Метод: PUT
URL: /api/products/update_product
Тело запроса:
    {
        "id": 1,
        "name": "Яблоко антоновка",
        "unit": "кг"
    }
Ответ:
[
    {
        "id": 1,
        "name": "Яблоко антоновка",
        "unit": "кг"
    }
]

6. Удалить продукт
Метод: DELETE
URL: /api/products/delete_product/{id}
Ответ:
"The product was deleted"

7. Удалить работника
Метод: DELETE
URL: /api/employees/delete_employee/{email}
Ответ:
"The employee was deleted"

8. Список всех собранных продуктов
Метод: GET
URL: /api/products/harvest
Ответ:
[
    {
        "id": 1,
        "employeeId": 2,
        "productId": 1,
        "quantity": 5.0,
        "date": "2024-03-16"
    },
    {
        "id": 2,
        "employeeId": 2,
        "productId": 2,
        "quantity": 3.0,
        "date": "2024-03-17"
    },
    {
        "id": 3,
        "employeeId": 1,
        "productId": 2,
        "quantity": 8.0,
        "date": "2024-03-17"
    }
]

9. Список продуктов по дате
Метод: GET
URL: /api/products/harvest/{date}
Ответ:
[
    {
        "id": 1,
        "employeeId": 2,
        "productId": 1,
        "quantity": 5.0,
        "date": "2024-03-16"
    }
]

10. Список продуктов по конкретному человеку
Метод: GET
URL: /api/products/harvest//findByEmployee/{id}
Ответ:
[
    {
        "id": 1,
        "employeeId": 2,
        "productId": 1,
        "quantity": 5.0,
        "date": "2024-03-16"
    },
    {
        "id": 2,
        "employeeId": 2,
        "productId": 2,
        "quantity": 3.0,
        "date": "2024-03-17"
    }
]

11. Добавить запись о собранном продукте
Метод: POST
URL: /api/products/add_harvest
Тело запроса:
{
    "employeeId":"1",
    "productId":"2",
    "quantity":"8"
}
Ответ:
[
    {
        "id": 3,
        "employeeId": 1,
        "productId": 2,
        "quantity": 8.0,
        "date": "2024-03-17"
    }
]