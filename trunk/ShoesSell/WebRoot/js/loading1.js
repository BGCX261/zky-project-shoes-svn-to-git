/**载入loading动画,imageSrc:动画图片地址*/
 function useLoadingImage(imageSrc) {
      var loadingImage;
      if (imageSrc) loadingImage = imageSrc;
      else loadingImage = "ajax-loader.gif";
      DWREngine.setPreHook(function() {
        var disabledImageZone = $('disabledImageZone');
        if (!disabledImageZone) {
          disabledImageZone = document.createElement('div');
          disabledImageZone.setAttribute('id', 'disabledImageZone');
          disabledImageZone.style.position = "absolute";
          disabledImageZone.style.zIndex = "1000";
          disabledImageZone.style.left = "0px";
          disabledImageZone.style.top = "0px";
          disabledImageZone.style.width = "100%";
          disabledImageZone.style.height = "100%";
         var imageZone = document.createElement('img');
          imageZone.setAttribute('id','imageZone');
          imageZone.setAttribute('src',imageSrc);
          imageZone.style.position = "absolute";
          imageZone.style.top = "0px";
          imageZone.style.right = "0px";
          disabledImageZone.appendChild(imageZone);
          document.body.appendChild(disabledImageZone);
        }
        else {
          $('imageZone').src = imageSrc;
          disabledImageZone.style.visibility = 'visible';
        }
      });
      DWREngine.setPostHook(function() {
        $('disabledImageZone').style.visibility = 'hidden';
      });
    } 