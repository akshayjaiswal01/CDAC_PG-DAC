$(document).ready(function () {
  let expression = "";

  $(".btn").not("#equals, #clear").click(function () {
    expression += $(this).text();
    $("#display").val(expression);
  });

  $("#clear").click(function () {
    expression = "";
    $("#display").val("");
  });

  $("#equals").click(function () {
    try {
      const result = eval(expression);
      $("#display").val(result);
      expression = result.toString();
    } catch (e) {
      $("#display").val("Error");
      expression = "";
    }
  });
});
