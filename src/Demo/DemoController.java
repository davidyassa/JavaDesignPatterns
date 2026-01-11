/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Demo;

// import all Demos
import Behavioral.Observer.ObserverDemo;
import Behavioral.Iterator.IteratorDemo;
import Behavioral.Strategy.Payment.StrategyDemo2;
import Behavioral.ChainOfResponsibility.ChainDemo;
import Behavioral.State.StateDemo;

import Creational.Factory.FactoryDemo;
import Creational.AbstractFactory.AbstractFactoryDemo;
import Creational.Builder.Cake.BuilderDemo;
import Creational.Prototype.PrototypeDemo;
import Creational.Singleton.SingletonDemo;

import Structural.Composite.Employee.CompositeDemo1;
//import Structural.Composite.Department.CompositeDemo2;
import Structural.Adapter.Class.AdapterDemo2;
import Structural.Proxy.ProxyDemo;
import Structural.Flyweight.FlyweightDemo;
import Structural.Facade.HomeTheater.FacadeDemo;
import Structural.Bridge.BridgeDemo;
import Structural.Decorator.DecoratorDemo;

import java.util.Map;
import java.util.function.Supplier;

/**
 *
 * @author DELL 7550
 */
public class DemoController {

    private Demo currentDemo;
    private static final Map<Integer, Map<Integer, Supplier<? extends Demo>>> REGISTRY
            = Map.of(
                    1, Map.<Integer, Supplier<? extends Demo>>of(
                            1, ObserverDemo::new,
                            2, IteratorDemo::new,
                            3, StrategyDemo2::new,
                            4, ChainDemo::new,
                            5, StateDemo::new
                    ),
                    2, Map.<Integer, Supplier<? extends Demo>>of(
                            1, FactoryDemo::new,
                            2, AbstractFactoryDemo::new,
                            3, BuilderDemo::new,
                            4, PrototypeDemo::new,
                            5, SingletonDemo::new
                    ),
                    3, Map.<Integer, Supplier<? extends Demo>>of(
                            1, CompositeDemo1::new,
                            2, AdapterDemo2::new,
                            3, ProxyDemo::new,
                            4, FlyweightDemo::new,
                            5, FacadeDemo::new,
                            6, BridgeDemo::new,
                            7, DecoratorDemo::new
                    )
            );

    public void runDemo(int categoryChoice, int demoChoice) {
        Map<Integer, Supplier<? extends Demo>> category = REGISTRY.get(categoryChoice);
        if (category == null) {
            throw new IllegalArgumentException("Invalid category: " + categoryChoice);
        }

        Supplier<? extends Demo> factory = category.get(demoChoice);
        if (factory == null) {
            throw new IllegalArgumentException("Invalid demo choice: " + demoChoice);
        }

        // same idea as: setCurrentDemo(new instanceOfThatClass())
        setCurrentDemo(factory.get());
        Demo.sep();
        currentDemo.run();
        Demo.sep();
    }

    public void setCurrentDemo(Demo currentDemo) {
        this.currentDemo = currentDemo;
    }

}
