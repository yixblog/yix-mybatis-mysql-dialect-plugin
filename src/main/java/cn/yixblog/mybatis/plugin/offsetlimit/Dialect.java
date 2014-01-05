package cn.yixblog.mybatis.plugin.offsetlimit;

public interface Dialect {

    public boolean supportsLimit();

    public String getLimitString(String sql, boolean hasOffset);

    public String getLimitString(String sql, int offset, int limit);

    public boolean supportsLimitOffset();

}
