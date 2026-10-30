@SaUcE

  Feature: SauceDemo saytinin yoxlanilmasi

    Background:Her scenariden sonra isletmek
      Scenario Outline:demo test

        Given Sauce sayta daxil olmaq

        When Username and password check
          |Field username    |  Value             |
          |First Username    |  <First Username>  |
          |Password          |  <Password>        |

        Then Yoxlama

        Examples:
          |First Username          |Password          |
          |standard_user           |secret_sauce      |
          |locked_out_user         |secret_sauce      |
          |problem_user            |secret_sauce      |
          |performance_glitch_user |secret_sauce      |
          |error_user              |secret_sauce      |
          |visual_user             |secret_sauce      |