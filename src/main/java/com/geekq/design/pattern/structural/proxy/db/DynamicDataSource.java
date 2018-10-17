package com.geekq.design.pattern.structural.proxy.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * Created by geekq
 */
public class DynamicDataSource extends AbstractRoutingDataSource {
    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceContextHolder.getDBType();
    }



//    <bean id="db0" class="org.apache.commons.dbcp.BasicDataSource" destroy-method="close">
//        <property name="driverClassName" value="${db.driverClassName}"/>
//        <property name="url" value="${db.url}"/>
//        <property name="username" value="${db.username}"/>
//        <property name="password" value="${db.password}"/>
//        <!-- 连接池启动时的初始值 -->
//        <property name="initialSize" value="${db.initialSize}"/>
//        <!-- 连接池的最大值 -->
//        <property name="maxActive" value="${db.maxActive}"/>
//        <!-- 最大空闲值.当经过一个高峰时间后，连接池可以慢慢将已经用不到的连接慢慢释放一部分，一直减少到maxIdle为止 -->
//        <property name="maxIdle" value="${db.maxIdle}"/>
//        <!-- 最小空闲值.当空闲的连接数少于阀值时，连接池就会预申请去一些连接，以免洪峰来时来不及申请 -->
//        <property name="minIdle" value="${db.minIdle}"/>
//        <!-- 最大建立连接等待时间。如果超过此时间将接到异常。设为－1表示无限制 -->
//        <property name="maxWait" value="${db.maxWait}"/>
//        <!--#给出一条简单的sql语句进行验证 -->
//         <!--<property name="validationQuery" value="select getdate()" />-->
//        <property name="defaultAutoCommit" value="${db.defaultAutoCommit}"/>
//        <!-- 回收被遗弃的（一般是忘了释放的）数据库连接到连接池中 -->
//         <!--<property name="removeAbandoned" value="true" />-->
//        <!-- 数据库连接过多长时间不用将被视为被遗弃而收回连接池中 -->
//         <!--<property name="removeAbandonedTimeout" value="120" />-->
//        <!-- #连接的超时时间，默认为半小时。 -->
//        <property name="minEvictableIdleTimeMillis" value="${db.minEvictableIdleTimeMillis}"/>
//
//        <!--# 失效检查线程运行时间间隔，要小于MySQL默认-->
//        <property name="timeBetweenEvictionRunsMillis" value="40000"/>
//        <!--# 检查连接是否有效-->
//        <property name="testWhileIdle" value="true"/>
//        <!--# 检查连接有效性的SQL语句-->
//        <property name="validationQuery" value="SELECT 1 FROM dual"/>
//    </bean>



//    <bean id="db1" class="org.apache.commons.dbcp.BasicDataSource" destroy-method="close">
//        <property name="driverClassName" value="${db.driverClassName}"/>
//        <property name="url" value="${db.url}"/>
//        <property name="username" value="${db.username}"/>
//        <property name="password" value="${db.password}"/>
//        <!-- 连接池启动时的初始值 -->
//        <property name="initialSize" value="${db.initialSize}"/>
//        <!-- 连接池的最大值 -->
//        <property name="maxActive" value="${db.maxActive}"/>
//        <!-- 最大空闲值.当经过一个高峰时间后，连接池可以慢慢将已经用不到的连接慢慢释放一部分，一直减少到maxIdle为止 -->
//        <property name="maxIdle" value="${db.maxIdle}"/>
//        <!-- 最小空闲值.当空闲的连接数少于阀值时，连接池就会预申请去一些连接，以免洪峰来时来不及申请 -->
//        <property name="minIdle" value="${db.minIdle}"/>
//        <!-- 最大建立连接等待时间。如果超过此时间将接到异常。设为－1表示无限制 -->
//        <property name="maxWait" value="${db.maxWait}"/>
//        <!--#给出一条简单的sql语句进行验证 -->
//         <!--<property name="validationQuery" value="select getdate()" />-->
//        <property name="defaultAutoCommit" value="${db.defaultAutoCommit}"/>
//        <!-- 回收被遗弃的（一般是忘了释放的）数据库连接到连接池中 -->
//         <!--<property name="removeAbandoned" value="true" />-->
//        <!-- 数据库连接过多长时间不用将被视为被遗弃而收回连接池中 -->
//         <!--<property name="removeAbandonedTimeout" value="120" />-->
//        <!-- #连接的超时时间，默认为半小时。 -->
//        <property name="minEvictableIdleTimeMillis" value="${db.minEvictableIdleTimeMillis}"/>
//
//        <!--# 失效检查线程运行时间间隔，要小于MySQL默认-->
//        <property name="timeBetweenEvictionRunsMillis" value="40000"/>
//        <!--# 检查连接是否有效-->
//        <property name="testWhileIdle" value="true"/>
//        <!--# 检查连接有效性的SQL语句-->
//        <property name="validationQuery" value="SELECT 1 FROM dual"/>
//    </bean>


//	<bean id="dataSource" class="DynamicDataSource">
//		<property name="targetDataSources">
//			<map key-type="java.lang.String">
//				<entry value-ref="db0" key="db0"></entry>
//				<entry value-ref="db1" key="db1"></entry>
//			</map>
//		</property>
//		<property name="defaultTargetDataSource" ref="db0"></property>
//	</bean>


//	<bean id="sqlSessionFactory" class="org.mybatis.spring.SqlSessionFactoryBean">
//		<property name="dataSource" ref="dataSource" />
//	</bean>
}
