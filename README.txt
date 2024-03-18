���������� ����������
��� ���������� ������������ ����� �������� ������� ���������� ������, 
����������� ��������� ����� ����������� ������������ � ���� ��������� ����� ���������.

�������������� ����������:
Java 17
Spring Boot 3.2.3
Spring Security
Spring Data JPA
Hibernate
PostgreSQL
JSON

����� � ������ ��� �������:
�������������: admin admin
������������: user user

REST API ������� � ������
1. ������ ���� ���������
�����: GET
URL: /api/products
�����:
[
    {
        "id": 2,
        "name": "������ ������ �����",
        "unit": "��"
    },
    {
        "id": 1,
        "name": "������ ������",
        "unit": "��"
    }
]

2. ������ ���� ����������
�����: GET
URL: /api/employees
�����:
[
    {
        "id": 1,
        "firstName": "����",
        "lastName": "������",
        "email": "John@gmail.com",
        "active": true
    },
    {
        "id": 2,
        "firstName": "�������",
        "lastName": "�����",
        "email": "smith@gmail.com",
        "active": true
    }
]

3. �������� ����� �������
�����: POST
URL: /api/products/add_product
���� �������:
{
    "name":"������ ������",
    "unit":"��"
}
�����:
[
    {
        "id": 1,
        "name": "������ ������",
        "unit": "��"
    }
]

4. �������� ������ ���������
�����: POST
URL: /api/employees/add_employee
���� �������:
{
    "firstName":"����",
    "lastName":"������",
    "email":"John@gmail.com"
}
�����:
[
    {
        "id": 1,
        "firstName": "����",
        "lastName": "������",
        "email": "John@gmail.com",
        "active": true
    }
]

5. �������� ���������� � ��������
�����: PUT
URL: /api/products/update_product
���� �������:
    {
        "id": 1,
        "name": "������ ���������",
        "unit": "��"
    }
�����:
[
    {
        "id": 1,
        "name": "������ ���������",
        "unit": "��"
    }
]

6. ������� �������
�����: DELETE
URL: /api/products/delete_product/{id}
�����:
"The product was deleted"

7. ������� ���������
�����: DELETE
URL: /api/employees/delete_employee/{email}
�����:
"The employee was deleted"

8. ������ ���� ��������� ���������
�����: GET
URL: /api/products/harvest
�����:
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

9. ������ ��������� �� ����
�����: GET
URL: /api/products/harvest/{date}
�����:
[
    {
        "id": 1,
        "employeeId": 2,
        "productId": 1,
        "quantity": 5.0,
        "date": "2024-03-16"
    }
]

10. ������ ��������� �� ����������� ��������
�����: GET
URL: /api/products/harvest//findByEmployee/{id}
�����:
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

11. �������� ������ � ��������� ��������
�����: POST
URL: /api/products/add_harvest
���� �������:
{
    "employeeId":"1",
    "productId":"2",
    "quantity":"8"
}
�����:
[
    {
        "id": 3,
        "employeeId": 1,
        "productId": 2,
        "quantity": 8.0,
        "date": "2024-03-17"
    }
]