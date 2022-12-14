# Задача Двоичный фасад

## Описание
В этом задании попрактикуемся с шаблоном *Facade* (*Фасад*). Вы уже знаете, что джава даёт нам много возможностей для вычислений, в том числе для парсинга чисел из произвольных систем счисления и обратно, произведения математических операций и так далее. Вам же надо написать простой класс-фасад к набору стандартных классов джавы, который будет уметь всего две вещи: складывать и перемножать числа в двоичной системе счисления:

```java
public class BinOps {
  public String sum(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, сложите и переведите
      обратно в двоичную запись*/
  }
  public String mult(String a, String b) {
    /*Переведите числа из двоичной записи в
      строках в int, перемножьте и переведите
      обратно в двоичную запись*/
  }
}
```

В итоге пользователь сможет выполнять эти две операции всего лишь через один вызов метода вашего класса, а не через самостоятельный вызов комбинации стандартных для джавы методов. Продемонстрируйте работоспособность в классе `Main`. 

## Реализация
1. Создайте класс `BinOps`, скопируйте его заготовку из кода выше.
2. Реализуйте оба метода. Для парсинга из двоичной записи используйте `Integer.parseInt(binStr, 2)`, для конвертации обратно - `Integer.toBinaryString`.
3. Создайте класс `Main`, продемонстрируйте работоспособность написанного вами класса:
```java
public class Main {
  public static void main(String[] args) {
    BinOps bins = new BinOps();s
    //демонстрация
  }
}
```
