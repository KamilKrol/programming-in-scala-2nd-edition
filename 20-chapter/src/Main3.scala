/**
  * Created by kamil on 07.01.16.
  */
object Main3 {

  def main(args: Array[String]) {

    val dog = new Dog
    functionForEat(dog)

  }

  def functionForEat[T <: {def eat(food : DogFood)}](somethingThatEatsDogFood: T): Unit = {
    somethingThatEatsDogFood.eat(new DogFood)
  }

  abstract class Food

  class DogFood extends Food

  abstract class Animal {
    type SuitableFood <: Food

    def eat(food: SuitableFood)
  }

  class Dog extends Animal {
    override type SuitableFood = DogFood

    override def eat(food: SuitableFood) {
      println("Dog eat: " + food)
    }
  }

}
