/*
 * @Author: YPL
 * @Date: 2022-08-09 20:27:26
 * @Description: 
 */
package annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
//@Documented注解表明使用此注解的元素应由 JavaDoc 记录。例如：
//在为类MyClass生成 javadoc 时，注解@MyCustomAnnotation将包含在其中。
@Target(ElementType.METHOD)
// @Target它指定了我们可以使用注解的位置。例如：在下面的代码中，我们将目标类型定义为METHOD，这意味着下面的注解只能用于方法
@Inherited
//@Inherited注解表示类中使用的自定义注解应该由其所有子类继承。例如：
//这里的类MyParentClass正在使用注解@MyCustomAnnotation，该注解用@inherited注解标记。这意味着子类MyChildClass继承了@MyCustomAnnotation。
@Retention(RetentionPolicy.RUNTIME)
//它指示要保留带注解类型的注解的时间长度。
//RetentionPolicy.RUNTIME：注解应该在运行时可用，以便通过 java 反射进行检查。
//RetentionPolicy.CLASS：注解将在.class文件中，但在运行时不可用。
//RetentionPolicy.SOURCE：注解将在程序的源代码中提供，它既不在.class文件中，也不在运行时可用。
public @interface MyCustomAnnotation {
    int studentAge() default 18;
    String studentName();
    String studnetAddress();
    String stuStream() default "CSE";
}
