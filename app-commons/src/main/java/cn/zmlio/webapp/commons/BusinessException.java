package cn.zmlio.webapp.commons;

/**
 * @author zml
 */
public class BusinessException extends RuntimeException {
    @Override
    public Throwable fillInStackTrace() {
        return this;
    }
}
