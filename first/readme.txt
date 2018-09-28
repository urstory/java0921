1. pom.xml 파일에 다음과 같은 의존성을 추가한다.
   스프링 관련 의존성을 추가한다.
   spring-context : Spring CORE
   spring-jdbc : Spring JDBC - JDBC를 쉽게 도와주는 것
   spring-tx : 트랜잭션처리에 대한 것
   
		<spring.version>4.3.5.RELEASE</spring.version>

		<!-- Spring -->
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-context</artifactId>
			<version>${spring.version}</version>
		</dependency>
		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-jdbc</artifactId>
			<version>${spring.version}</version>
		</dependency>

		<dependency>
			<groupId>org.springframework</groupId>
			<artifactId>spring-tx</artifactId>
			<version>${spring.version}</version>
		</dependency>
		
		<!-- 커넥션 풀 구현 -->
		<dependency>
			<groupId>org.apache.commons</groupId>
			<artifactId>commons-dbcp2</artifactId>
			<version>2.1.1</version>
		</dependency>
		

2. Spring관련된 설정파일을 작성해야한다.
   Spring은 요즘 Java Config라는 방법으로 설정파일을 작성한다.
   예전에는 xml파일로 작성했었다.
   
ApplicationConfig 를 작성한다.


3. ApplicationConfig를 사용하는 간단한 예제.   









