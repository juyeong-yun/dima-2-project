# 디지털마스터 3기 2차 프로젝트 - 웹 구현
- 사용 언어 : Java, Html5, css3, javascript, Oracle, Python(LSTM 모델)
- 개발 환경 : VS code, Spring Boot, Sqldeveloper, Bootstraps

--- 

📦main
 ┣ 📂java
 ┃ ┗ 📂net
 ┃ ┃ ┗ 📂kdigital
 ┃ ┃ ┃ ┗ 📂ec21
 ┃ ┃ ┃ ┃ ┣ 📂config
 ┃ ┃ ┃ ┃ ┣ 📂controller
 ┃ ┃ ┃ ┃ ┃ ┣ 📜CustomerController.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜InquiryController.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜MainController.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ManagerController.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜ProductController.java
 ┃ ┃ ┃ ┃ ┣ 📂dto
 ┃ ┃ ┃ ┃ ┃ ┣ 📂check
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜CustomerGubun.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜InquiryEnum.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ProductCategory.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ProhibitReason.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┣ 📜ReportCategory.java
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜YesOrNo.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📂modelDTO
 ┃ ┃ ┃ ┃ ┃ ┃ ┗ 📜Lstm.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜BlacklistDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜CustomerDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜CustomerListModalDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜InquiryBlockDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜InquiryDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜InquiryModalDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ModelPredictDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ModelPredictModalDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ProductDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ProhibitSimilarWordDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ProhibitWordDTO.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ReportCustomerDTO.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜ReportedCustomerWithInfoDTO.java
 ┃ ┃ ┃ ┃ ┣ 📂entity
 ┃ ┃ ┃ ┃ ┃ ┣ 📜BlacklistEntity.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜CustomerEntity.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜InquiryBlockEntity.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜InquiryEntity.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ProductEntity.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ProhibitSimilarWordEntity.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ProhibitWordEntity.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜ReportCustomerEntity.java
 ┃ ┃ ┃ ┃ ┣ 📂repository
 ┃ ┃ ┃ ┃ ┃ ┣ 📜BlacklistRepository.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜CustomerRepository.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜InquiryBlockRepository.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜InquiryRepository.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ProductRepository.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ProhibitSimilarWordRepository.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ProhibitWordRepository.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜ReportCustomerRepository.java
 ┃ ┃ ┃ ┃ ┣ 📂service
 ┃ ┃ ┃ ┃ ┃ ┣ 📜CustomerService.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜InquiryService.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ManagerService.java
 ┃ ┃ ┃ ┃ ┃ ┣ 📜ModelService.java
 ┃ ┃ ┃ ┃ ┃ ┗ 📜ProductService.java
 ┃ ┃ ┃ ┃ ┣ 📂util
 ┃ ┃ ┃ ┃ ┃ ┗ 📜FileService.java
 ┃ ┃ ┃ ┃ ┗ 📜Ec21Application.java
 ┗ 📂resources
 ┃ ┣ 📂static
 ┃ ┃ ┣ 📂build
 ┃ ┃ ┃ ┣ 📂css
 ┃ ┃ ┃ ┃ ┣ 📜custom.css
 ┃ ┃ ┃ ┃ ┗ 📜custom.min.css
 ┃ ┃ ┃ ┣ 📂images
 ┃ ┃ ┃ ┃ ┣ 📜back_disabled.png
 ┃ ┃ ┃ ┃ ┣ 📜back_enabled.png
 ┃ ┃ ┃ ┃ ┣ 📜back_enabled_hover.png
 ┃ ┃ ┃ ┃ ┣ 📜forward_disabled.png
 ┃ ┃ ┃ ┃ ┣ 📜forward_enabled.png
 ┃ ┃ ┃ ┃ ┣ 📜forward_enabled_hover.png
 ┃ ┃ ┃ ┃ ┗ 📜loading.gif
 ┃ ┃ ┃ ┗ 📂js
 ┃ ┃ ┃ ┃ ┣ 📜custom.js
 ┃ ┃ ┃ ┃ ┗ 📜custom.min.js
 ┃ ┃ ┣ 📂data
 ┃ ┃ ┣ 📂docs
 ┃ ┃ ┃ ┣ 📂css
 ┃ ┃ ┃ ┃ ┣ 📜animate.min.css
 ┃ ┃ ┃ ┃ ┣ 📜bootstrap.min.css
 ┃ ┃ ┃ ┃ ┣ 📜docs.min.css
 ┃ ┃ ┃ ┃ ┗ 📜shCoreDefault.css
 ┃ ┃ ┃ ┣ 📂fonts
 ┃ ┃ ┃ ┃ ┣ 📂css
 ┃ ┃ ┃ ┃ ┣ 📂fonts
