# ADR 1: Регистрация на платформе для представителей компаний

## Контекст и обозначение проблемы

Представители компаний, желающие защитить свои продукты при помощи платформы, должны иметь возможность зарегистрироваться. Необходимо
определить наиболее подходящий механизм регистрации.

## Список решаемых бизнес-требований

- **User Story 1: Регистрация на платформе**

## Список возможных решений

1. Реализация формы регистрации с использованием электронной почты и пароля.
2. Возможность регистрации через Яндекс или Гугл OpenId.

## Принятое решение

Принято решение №1: Реализация формы регистрации с использованием электронной почты и пароля.

## Обоснование принятия решения

Этот вариант был выбран, так как предоставляет базовый, но эффективный механизм для регистрации пользователей.
Регистрация через электронную почту и пароль обеспечивает стандартный и удобный способ доступа на платформу. В
дальнейшем можно реализовать дополнительные методы аутентификации, такие как восстановление пароля или двухфакторная
аутентификация, для повышения безопасности и удобства использования.

# ADR 2: Управление партиями

## Контекст и обозначение проблемы

Представители компаний должны иметь возможность создавать, редактировать и удалять продуктовые партии.
Необходимо определить наиболее эффективный механизм управления партиями.

## Список решаемых бизнес-требований

- **User Story 2: Управление партиями**

## Список возможных решений

1. Создание панели управления для представителей компаний, где они могут создавать, редактировать и удалять партии.
2. Интеграция сторонних сервисов для управления партиями.

## Принятое решение

Принято решение №1: Создание панели управления для поставщиков.

## Обоснование принятия решения

Этот вариант был выбран, так как предоставляет наиболее гибкий и контролируемый способ управления объявлениями для
поставщиков. Панель управления позволит поставщикам легко добавлять, редактировать и удалять объявления, что обеспечит
удобство и эффективность в работе.

# ADR 3: Проверка QR кодов конечными пользователями

## Контекст и обозначение проблемы

Необходимо определить механизм формирования и проверки QR кодов конечными пользователями.

## Список решаемых бизнес-требований

- **User Story 3: Проверка QR кодов конечными пользователями**

## Список возможных решений

1. Пользователи заходят на сайт и сканируют QR код через специальное поле или водят данные руками.
2. Пользователи сканируют QR и сразу переходят на конечную страницу.

## Принятое решение

Принято решение №2: Пользователи сканируют QR и сразу переходят на конечную страницу.

## Обоснование принятия решения

Этот вариант был выбран, так как предоставляет наиболее гибкий и простой способ проверки QR кодов. 
Переход по прямой ссылке минимизирует человеческий фактор и ускоряет процесс. 
Принято решение разработать страницу куда пользователь будет перенаправлен после перехода по ссылке.
