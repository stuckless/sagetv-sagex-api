package sagex.util;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class ReflectionUtil {
    public static Class getGenericReturnType(Method method) {
        Type returnType = method.getGenericReturnType();

        if (returnType instanceof ParameterizedType) {
            ParameterizedType type = (ParameterizedType) returnType;
            Type[] typeArguments = type.getActualTypeArguments();
            if (typeArguments.length > 0) {
                return (Class) typeArguments[0];
            }
        }
        return null;
    }
    
    public static Class getGenericReturnType(Field field) {
        Type returnType = field.getGenericType();

        if (returnType instanceof ParameterizedType) {
            ParameterizedType type = (ParameterizedType) returnType;
            Type[] typeArguments = type.getActualTypeArguments();
            if (typeArguments.length > 0) {
                return (Class) typeArguments[0];
            }
        }
        return null;
    }

    public static Class getGenericReturnType(Type returnType) {
        if (returnType instanceof ParameterizedType) {
            ParameterizedType type = (ParameterizedType) returnType;
            Type[] typeArguments = type.getActualTypeArguments();
            if (typeArguments.length > 0) {
                if (typeArguments[0] instanceof Class) {
                    return (Class) typeArguments[0];
                }
            }
        }
        return null;
    }
}
