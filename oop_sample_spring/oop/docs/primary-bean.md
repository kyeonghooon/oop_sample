## 빈 관리 및 @Primary 사용 설명

이 프로젝트에서는 여러 구현체가 존재하는 인터페이스에 대해 기본적으로 사용할 구현체를 설정하기 위해 `@Primary` 어노테이션을 사용하고 있습니다. 

### DiscountPolicy 인터페이스 구현체
`DiscountPolicy` 인터페이스는 두 가지 구현체가 존재합니다:
1. **PercentDiscountPolicyImpl** (정률 할인 정책)
2. **FixDiscountPolicyImpl** (고정 할인 정책)

현재 프로젝트에서는 **PercentDiscountPolicyImpl**이 기본적으로 사용됩니다. 
이를 위해 `@Primary` 어노테이션을 **PercentDiscountPolicyImpl** 클래스에 적용하였습니다.