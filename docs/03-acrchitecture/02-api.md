# API

## Описание сущности Партия (batch)

1. BatchId - внутренний ID 
2. Number - порядковый номер для данного пользователя
3. Description - примечание
4. Status - статус партии (new, padding, rejected, complete)
5. OwnerId - ИД владельца 
6. Goods [] - Список товаров (goods)
7. CreateAt - время создания
8. ModifyAt - время последнего редактирования  

## Функции (эндпониты)

1. CRUDS (create, read, update ) для партий (batch)

## сущности Партия (good)

1. GoodId - внутренний ID
2. Number - порядковый номер для данной партии
3. Description - примечание
4. VendorCode - код производителя
5. Count - количество тегов
6. BatchId - внутренний ID партии

## Функции (эндпониты)

1. CRUDS (create, read, update, delete ) для партий (good)

## Описание сущности Проверка кода (checkCode)

1. CheckCodeId - внутренний ID
2. Count - количество вызовов 
3. CreateAt - время создания
4. Activated - код активирован

## Функции (эндпониты)

1. CRUDS (create, read, update ) для партий (checkCode)
