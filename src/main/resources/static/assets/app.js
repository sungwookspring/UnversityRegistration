var main = {
    init : function() {
        var _this = this;
        $('#btn-student-register').on('click', function(){
            _this.student_register();
        });
        $('#btn-course-enroll').on('click', function(){
            _this.enroll_course();
        });
    },

    student_register : function() {
        var data = {
            first_name: $('#first_name').val(),
            last_name: $('#last_name').val()
        };
        $.ajax({
            type: 'POST',
            url: '/student/register',
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function (){
            alert('수강등록이 완료되었습니다');
            window.location.href = '/';
        }).fail(function (error){
            alert(JSON.stringify(error));
        });
    },

    enroll_course : function() {
        var data = {
            title: $('#course_title').val(),
            grade: $('#course_last_name').val()
        };
        $.ajax({
            type: 'POST',
            url: '/professor/course/enroll',
            dataType: 'json',
            contentType: 'application/json; charset=utf-8',
            data: JSON.stringify(data)
        }).done(function (){
            alert('회원가입이 완료되었습니다');
            window.location.href = '/';
        }).fail(function (error){
            alert(JSON.stringify(error));
        });
    }
};

main.init();