package de.plushnikov.superbuilder;

import lombok.experimental.SuperBuilder;

public class SuperBuilderSimple {

  @SuperBuilder
  public static class Parent {
    int field1;
    String item;
//    List<String> items;
  }

  @SuperBuilder
  public static class Child extends Parent {
    double field3;
  }

  public static void test() {
    Child.ChildBuilder<?, ?> childBuilder = Child.builder();
    Child.ChildBuilder<?, ?> childBuilder1 = childBuilder.field3(0.0);
    Child.ChildBuilder<?, ?> childBuilder2 = childBuilder1.field1(5);
    Child.ChildBuilder<?, ?> childBuilder3 = childBuilder2.item("");
    Child x = childBuilder3.build();
    System.out.println(x);

    Child y = Child.builder().field3(0.0).field1(5).item("").build();
    System.out.println(y);

    Parent sasd = Parent.builder().item("sasd").field1(1).build();
    System.out.println(sasd);
  }
}
